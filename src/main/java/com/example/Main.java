package com.example;

import org.example.BFSCrawler;
import org.example.DFSCrawler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take URL input from the user
        System.out.println("Enter the starting URL:");
        String startUrl = scanner.nextLine();

        // Take input for selecting BFS or DFS
        System.out.println("Choose the crawler:");
        System.out.println("1. BFS Crawler");
        System.out.println("2. DFS Crawler");
        int choice = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        // Run the selected crawler
        switch (choice) {
            case 1:
                System.out.println("Running BFS Crawler...");
                BFSCrawler.bfsCrawl(startUrl);
                break;

            case 2:
                System.out.println("Running DFS Crawler...");
                DFSCrawler.crawl(1, startUrl, new java.util.ArrayList<>());
                break;

            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution Time: " + executionTime + " ms");

        scanner.close();
    }
}
