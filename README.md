# Web Crawler Project

## Overview
This project implements two types of web crawlers: Breadth-First Search (BFS) and Depth-First Search (DFS) using the Jsoup library in Java. Users can choose which crawler to run, provide a starting URL, and see the results along with the execution time.

## Features
- **BFS Crawler**: Visits links in a breadth-first manner, exploring all neighbors before moving to the next level.
- **DFS Crawler**: Visits links in a depth-first manner, exploring as far as possible along each branch before backtracking.
- Displays the URLs visited and their corresponding titles.
- Measures and outputs the execution time of the crawling process.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (or any Java IDE)
- Gradle

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone <https://github.com/Garav1/Minor.git>
   cd <https://github.com/Garav1/Minor.git>
   ```

2. **Open the Project in IntelliJ**
   - Launch IntelliJ IDEA.
   - Select "Open" and navigate to the cloned project directory.

3. **Add Jsoup Dependency**
   - Open the `build.gradle` file and add the following dependency:
     ```groovy
     dependencies {
         implementation 'org.jsoup:jsoup:1.18.1'
     }
     ```
   - Sync the Gradle project to download the Jsoup library.

4. **Project Structure**
   Ensure that the following Java files are located in the `src/main/java/org/example` directory:
   - `Main.java`
   - `BFSCrawler.java`
   - `DFSCrawler.java`

## Usage Instructions

1. **Run the Project**
   - Execute the `Main.java` file. 
   - You will be prompted to enter the starting URL for crawling.

2. **Choose Crawler Type**
   - Input `1` for the BFS crawler.
   - Input `2` for the DFS crawler.

3. **View Results**
   - The program will display the links visited and their titles.
   - After the crawling process, the execution time will be displayed.

## Example Output
```
Enter the starting URL:
https://example.com
Choose the crawler:
1. BFS Crawler
2. DFS Crawler
1
Running BFS Crawler...
Processing depth: 0
Link: https://example.com
Title: Example Domain
Link: https://example.com/more-links
Title: More Links
...
Execution Time: 200 ms
```

## Notes
- The crawlers are limited to a maximum depth of 5 levels to prevent excessive crawling.
- Ensure that the URLs provided are reachable and accessible.
- Handle exceptions gracefully, particularly for URLs that may not respond or are blocked.

## Troubleshooting
- If you encounter issues related to Jsoup or connection errors, verify your internet connection and ensure the URLs are valid.
- Check for typos in the URL input.

---
