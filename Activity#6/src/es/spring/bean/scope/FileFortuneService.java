package es.spring.bean.scope;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private String fileName = "C:\\workspaceSpring\\Activity#5\\src\\es\\spring\\dependency\\injection/fortune-data.txt";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println("inside the constructor");
	}

	@PostConstruct
	public void readFileFortuneService() {
		System.out.println("start to read: ");

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	public void stopFileFortuneService() {
		System.out.println("stop to read ");
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}

}
