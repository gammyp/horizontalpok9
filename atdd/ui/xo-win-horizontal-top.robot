*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}    http://localhost:8080/xo/xo.jsp
${BROWSER}    chrome

*** Test Cases ***
ผู้เล่นคนที่ 2 ชนะที่โดยแนวนอนแถวที่ 1
    เปิดหน้าเว็บOX
    คลิ๊กตำแหน่งแถว1คอลัมน์1
    คลิ๊กตำแหน่งแถว2คอลัมน์1
    คลิ๊กตำแหน่งแถว1คอลัมน์2
    คลิ๊กตำแหน่งแถว2คอลัมน์2
    คลิ๊กตำแหน่งแถว1คอลัมน์3
    แสดงผลว่า player2 มี 1 score
    ปิดหน้าเกม

*** Keywords ***
เปิดหน้าเว็บOX
    Open Browser    ${URL}  ${BROWSER}

คลิ๊กตำแหน่งแถว1คอลัมน์1
    Click Element    id=R1_C1
    Wait Until Element Contains    id=R1_C1    X

คลิ๊กตำแหน่งแถว2คอลัมน์1
    Click Element    id=R2_C1
    Wait Until Element Contains    id=R2_C1    O

คลิ๊กตำแหน่งแถว1คอลัมน์2
    Click Element    id=R1_C2
    Wait Until Element Contains    id=R1_C2    X

คลิ๊กตำแหน่งแถว2คอลัมน์2
    Click Element    id=R2_C2
    Wait Until Element Contains    id=R2_C2    O

คลิ๊กตำแหน่งแถว1คอลัมน์3
    Click Element    id=R1_C3
    Wait Until Element Contains    id=R1_C3    X

แสดงผลว่า player2 มี 1 score
    Wait Until Element Contains    id=player2Score    1
ปิดหน้าเกม
    Close Browser