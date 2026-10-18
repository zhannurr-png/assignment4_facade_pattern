# Media Conversion Facade

**Name:** Zhannur Bakyt\
**Group:** SE-2524\
**Repository:** https://github.com/zhannurr-png/assignment4_facade_pattern.git

## Overview
This project demonstrates the Facade Design Pattern using a simplified media conversion system implemented in Java.

The system provides a single interface for converting media files and adjusting audio volume. 
The facade coordinates several subsystem classes and hides their implementation details from the client.

## Facade class
`MediaConversionFacade` - Coordinates the subsystem classes and provides a single convert() class.

## Subsystem classes
`MetadataReader` - Reads the file extension to determine source format.\
`CodecFactory` - Selects the codec for a supported media format.\
`MediaConverter` - Simulates media conversion by creating converted filename.\
`AudioMixer` - Adjusts the simulated audio volume.

## Supported Formats
`AVI`\
`MP4`\
`MP3`

## How it works
1. The client enters the filename;
2. Selects the target format;
3. The client enters the current volume;
4. Chooses increase or decrease;
5. The facade determines the source format and select codecs;
6. The media converter simulates media conversion;
7. The audio mixer calculates adgusted volume;
8. The final result.

## Example 
`Input:`\
Enter a file name: movie.avi\
Enter a target format: mp4\
Current volume: 70\
Action: increase

`Output:`\
Converted file: movie.mp4 | Source codec: AVI Codec | Target Codec: MP4 Codec | Adjusted volume: 80%

## Project structure
```text
|-- Main.java
|-- facade/
|  |-- MediaConversionFacade.java
|-- subsystem/
|  |-- MetadataReader.java
|  |-- CodecFactory.java
|  |-- MediaConverter.java
|  |-- AudioMixer.java
```
## Conclusion
This project demonstrates how the Facade Design Pattern simplifies client 
interaction with multiple subsystem classes, separates responsibilities 
and provides a unified interface for a media conversion workflow.