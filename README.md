# 비속어 순화기 
#### ( 부제 : 우리말 바르고 고운말 )
  
  2022년에 진행한 개인프로젝트 입니다.
  
  프로젝트 기간: 2022년 8월 17일 ~ 2022년 8월 18일
    
--------------------------------------------------------------------------------------------------------------------------------------------------- 
 
* ### 사용기술 
  ```
  - java,MySQL
  ```
* ### 구동 환경
  ```
  - Window  
  ```
* ### 프로그램의 필요성  
  ```
  - 시간이 지날수록 우리들의 아름다운 한글이 바르고 고운말이 아닌 비속어들로 사용될 때들이 점점 많아지는 것을 느끼게 됐다.  
    프로그래밍으로 이를 순화할 수 있을지를 내가 배운것들을 토대로 확인하고 싶었다.   
  ```
* ### 프로그램 기능  
  ```
  - 번역기와 같이 문자 혹은 문장을 넣었을 때 비속어가 포함됐다면 바른말로 순화하여 출력해줌    
  ```
* ### 프로그램 구조

    ```bash
    swear-words-purifier
         ├─App.java
         │
         ├─controller
         │  WordsPurifierController.java
         │
         ├─model
         │  Word.java
         │
         ├─dao
         │   WordsPurifierDAO.java
         │
         ├─utils
         │   WordsPurifierUtils.java
         │
         ├─scanner
         │   WordsPurifierScanner.java
         │
         ├─service
         │   WordsPurifierService.java
         │
         ├─view
         │   WordsPurifierView.java
         │
         │
         │
         └─Database───MySQL──swear_words_purifier
            
    ``` 
    
* ### 데이터 구조  

  | Field       | Type        | Key | Extra          |
  |-------------|-------------|-----|----------------|
  | bad_word_id | int         | PRI | auto_increment |
  | bad_word    | varchar(14) |     |                |
  | kind_word   | varchar(14) |     |                |
      
* ### 느낀 점
  ```
  내가 한달간 배운 것들을 토대로 Java와 MySQL을 토대로 내가 원하는 프로그램을 만들 수 있다는 게 신기하고 재미있었다.  
  저번 미니 프로젝트때는 MVC 패턴을 토대로 만들고 싶었지만 프로그램을 구축하는 과정에 있어 경험이 없다보니, 그저 패키지만 MVC패턴으로 나눠놓은
  MVC패턴이라고는 할 수 없는 구조였지만, 이번에는 그 전 경험을 토대로 좀 더 제대로 된 MVC 패턴을 구축 할 수 있었다는 것이 
  나에게 만족감을 주었다.
  ```
* ### 동작 과정
  
  ![image url](https://github.com/12OneTwo12/swear-words-purifier/blob/main/ezgif.com-gif-maker%20(2).gif?raw=true)  
    
