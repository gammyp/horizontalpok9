*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}    http://localhost:8080/xo/xo.jsp
${BROWSER}    chrome

*** Test Cases ***
ผู้เล่นคนที่ 1 ชนะที่โดยแนวทะแยงจากบนซ้ายไปล่างขวา
    เปิดหน้าเว็บOX
    คลิ๊กตำแหน่งแถว1คอลัมน์1
    คลิ๊กตำแหน่งแถว2คอลัมน์1
    คลิ๊กตำแหน่งแถว2คอลัมน์2
    คลิ๊กตำแหน่งแถว2คอลัมน์3
    คลิ๊กตำแหน่งแถว3คอลัมน์3
    แสดงผลว่า player1 มี 1 score
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

คลิ๊กตำแหน่งแถว2คอลัมน์2
    Click Element    id=R2_C2
    Wait Until Element Contains    id=R2_C2    X

คลิ๊กตำแหน่งแถว2คอลัมน์3
    Click Element    id=R2_C3
    Wait Until Element Contains    id=R2_C3    O

คลิ๊กตำแหน่งแถว3คอลัมน์3
    Click Element    id=R3_C3
    Wait Until Element Contains    id=R3_C3    X

แสดงผลว่า player1 มี 1 score
    Wait Until Element Contains    id=player1Score    1
ปิดหน้าเกม
    Close Browser