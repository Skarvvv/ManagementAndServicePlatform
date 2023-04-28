-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: msp_p
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_doctor`
--

DROP TABLE IF EXISTS `t_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_doctor` (
  `did` int NOT NULL AUTO_INCREMENT,
  `dcode` varchar(36) DEFAULT NULL,
  `dname` varchar(30) DEFAULT NULL,
  `dpassword` varchar(30) DEFAULT NULL,
  `davatar` varchar(300) DEFAULT NULL,
  `drealname` varchar(30) DEFAULT NULL,
  `dgender` varchar(10) DEFAULT NULL,
  `dbirthday` date DEFAULT NULL,
  `dtel` varchar(20) DEFAULT NULL,
  `didentity` varchar(30) DEFAULT NULL,
  `dstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`did`),
  UNIQUE KEY `dcode` (`dcode`),
  UNIQUE KEY `dtel` (`dtel`),
  UNIQUE KEY `didentity` (`didentity`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_doctor`
--

LOCK TABLES `t_doctor` WRITE;
/*!40000 ALTER TABLE `t_doctor` DISABLE KEYS */;
INSERT INTO `t_doctor` VALUES (1,'testDoctor_001','ls123','123','#','lisi','female','2001-08-27','19805996936','35070220010527','001'),(2,'testDoctor_002','ww234','234','#','wangwu','female','2001-03-17','19805992222','35070220010000','001');
/*!40000 ALTER TABLE `t_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_feedback`
--

DROP TABLE IF EXISTS `t_feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_feedback` (
  `fid` int NOT NULL AUTO_INCREMENT,
  `fcode` varchar(36) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `fcontent` varchar(1000) DEFAULT NULL,
  `ftime` datetime DEFAULT NULL,
  `fstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`fid`),
  UNIQUE KEY `fcode` (`fcode`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_feedback`
--

LOCK TABLES `t_feedback` WRITE;
/*!40000 ALTER TABLE `t_feedback` DISABLE KEYS */;
INSERT INTO `t_feedback` VALUES (1,'testFeedback_001',1,'This the content of the feedback called testFeedback_001 for testing only.','2023-04-18 17:12:57','001'),(4,'d169ab9c-325e-42d8-a99e-2eb235a822a3',1,'This the content of the feedback called testFeedback_004 for testing only.','2023-04-27 21:20:25','001'),(5,'bc4e2a23-993d-4e48-9fb5-fa23d70cc1fd',6,'i think it is ok enough~','2023-04-28 11:15:39','001');
/*!40000 ALTER TABLE `t_feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_followup`
--

DROP TABLE IF EXISTS `t_followup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_followup` (
  `fid` int NOT NULL AUTO_INCREMENT,
  `fcode` varchar(36) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `did` int DEFAULT NULL,
  `fcontent` varchar(1000) DEFAULT NULL,
  `ftime` datetime DEFAULT NULL,
  `fstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`fid`),
  UNIQUE KEY `fcode` (`fcode`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_followup`
--

LOCK TABLES `t_followup` WRITE;
/*!40000 ALTER TABLE `t_followup` DISABLE KEYS */;
INSERT INTO `t_followup` VALUES (1,'testFollowup_001',1,2,'This the content of the status called testFollowup_001 for testing only.','2023-04-18 17:14:35','001'),(2,'6bbc0fa6-63f9-4a87-a49d-03d315dbd1b9',1,1,'This the content of the status called testFollowup_002 for testing only.','2023-04-03 17:30:00','001');
/*!40000 ALTER TABLE `t_followup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_medicine`
--

DROP TABLE IF EXISTS `t_medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_medicine` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `mcode` varchar(36) DEFAULT NULL,
  `mname` varchar(100) DEFAULT NULL,
  `mprice` decimal(10,2) DEFAULT NULL,
  `mdescription` varchar(1000) DEFAULT NULL,
  `mimage` varchar(300) DEFAULT NULL,
  `mtimes` varchar(100) DEFAULT NULL,
  `mdosage` varchar(100) DEFAULT NULL,
  `mbuilder` int DEFAULT NULL,
  `mbuildtime` datetime DEFAULT NULL,
  `mupdater` int DEFAULT NULL,
  `mupdatetime` datetime DEFAULT NULL,
  `mstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`mid`),
  UNIQUE KEY `mcode` (`mcode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_medicine`
--

LOCK TABLES `t_medicine` WRITE;
/*!40000 ALTER TABLE `t_medicine` DISABLE KEYS */;
INSERT INTO `t_medicine` VALUES (1,'testMedicine_001','999 Kanganling Granules',120.80,'This product is light brown to dark brown granules with a sweet, slightly bitter taste.','https://bkimg.cdn.bcebos.com/pic/6a600c338744ebf81a4c9a48beb7c02a6059252d093f?x-bce-process=image/resize,m_lfit,w_536,limit_1','three times per day','one pieces per time',1,'2023-03-10 12:30:00',2,'2023-04-19 15:58:42','001'),(2,'testMedicine_002','ibuprofen sustained-release capsules',204.50,'Indications are for the relief of mild to moderate pain such as headache, joint pain, migraine, toothache, muscle pain, neuralgia, dysmenorrhea. It is also used for fever caused by the common cold or influenza.','https://tse4-mm.cn.bing.net/th/id/OIP-C.sZcW4mmsMRcwm9SC2ndzvgHaFj?w=280&h=210&c=7&r=0&o=5&pid=1.7','one times every two days','200ml per time',2,'2021-04-08 02:14:00',1,'2023-04-19 15:58:42','001'),(3,'testMedicine_003','Chuan Bei batch syrup',42.53,'Clearing heat and promoting lung, eliminating phlegm and relieving cough. It is used for cough and phlegm yellow or phlegm upset, throat swelling and pain, chest distension and pain caused by wind heat invading lung and phlegm heat internal resistance. Cold, bronchitis see the above syndromes.','https://tse1-mm.cn.bing.net/th/id/OIP-C.lUkUDLY076-VjDn37QtoMwHaHa?w=199&h=199&c=7&r=0&o=5&pid=1.7','four times per day','three pieces per time',1,'2020-11-19 02:14:00',1,'2023-04-19 15:58:42','001');
/*!40000 ALTER TABLE `t_medicine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_news`
--

DROP TABLE IF EXISTS `t_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_news` (
  `nid` int NOT NULL AUTO_INCREMENT,
  `nname` varchar(100) DEFAULT NULL,
  `ntime` datetime DEFAULT NULL,
  `did` int DEFAULT NULL,
  `ncontent` varchar(10000) DEFAULT NULL,
  `nimg` varchar(300) DEFAULT NULL,
  `nstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_news`
--

LOCK TABLES `t_news` WRITE;
/*!40000 ALTER TABLE `t_news` DISABLE KEYS */;
INSERT INTO `t_news` VALUES (1,'kidney transplant','2020-07-14 14:30:00',1,'Currently, there are many patients who need kidney transplant surgery, and in China, cadaveric kidney transplantation is the main type of transplant. The one-year survival rate of transplanted kidneys is over 90%, the five-year survival rate is over 70%, and 50% of patients can survive for more than 10 years. Living donor kidney transplantation is already widespread abroad, but in China, it is still relatively rare, accounting for only 1% to 2% of all kidney transplants. Compared with cadaveric kidney transplantation, living donor kidney transplantation has the advantages of faster kidney function recovery and longer survival time.\n\nMost patients with chronic kidney failure can undergo kidney transplant surgery, but they must undergo comprehensive and rigorous examinations before the surgery. Patients with active hepatitis, tuberculosis, ulcers, and other diseases are not suitable for kidney transplant surgery because, except for twin donors, who have the same blood type as the patient, other patients need to take long-term drugs, such as steroids and other anti-rejection drugs after the surgery, which can accelerate the deterioration of the above diseases. Therefore, doctors would not recommend kidney transplant surgery for patients with these diseases. In addition, patients who are suitable for surgery are generally between adulthood and around 60 years old. For elderly people in their seventies and eighties, kidney transplant surgery is generally not recommended because they may not be able to withstand the impact of surgery due to their old age.\n\nLiving donor kidney transplant donors are generally relatives who have the same blood type and a relatively matched tissue type. They should be between adulthood and 50 years old, in good health, and both of their kidneys must function normally. Dr. Nie Qingsheng believes that hospitals are very cautious about living donor kidney transplantation and inform both parties of the potential adverse consequences, such as the fact that if Zhang donates one kidney, the other kidney cannot have any problems; otherwise, they may have to go through the process of kidney transplantation again. In addition, for doctors, the risk of living donor kidney transplantation is twice that of cadaveric transplantation because two people are involved in the surgery. If the surgery fails, it will affect both parties. A person can live a normal life with one kidney, but having two kidneys is more secure.\n\nExcept for twin donors, most patients need to take anti-rejection drugs for life to reduce and prevent rejection of the transplanted kidney in the recipient\'s body, but even with drug adherence, rejection reactions are not entirely avoidable. The best transplant centers worldwide report a rate of around 15% for post-transplant rejection reactions.\n\nAcute rejection reactions are more common, usually occurring within 6 to 90 days after surgery, but these reactions can be prevented and treated with medication and are mostly reversible. Another common type of rejection reaction is chronic rejection, which usually has no significant symptoms in the early stages, making it difficult to detect. Once symptoms appear, it is usually already in the late stage and challenging to reverse.\n\nCurrently, kidney transplant and dialysis are the only effective methods to treat chronic kidney failure, and kidney transplant has the advantages of a higher quality of life, longer survival time, and fewer restrictions on diet and activities compared to dialysis.','https://th.bing.com/th/id/OIP.wZyG3qXEMT48qBqQowHSpwHaFP?pid=ImgDet&rs=1','001'),(2,'Here are 14 things you should know about kidney transplantation. (Knowledge of nephropathy)','2022-03-03 10:30:00',2,'We know that when chronic kidney disease progresses to end-stage renal disease, it can only be treated with renal replacement therapy - dialysis and kidney transplantation - to replace the damaged kidney function and maintain the patient\'s health. Among these two therapies, kidney transplantation can completely replace the function of the patient\'s own kidney, thoroughly remove toxins, and is currently recognized as the kidney replacement therapy that can most improve the quality of life of patients with end-stage renal disease worldwide. Today, we will have a good understanding of it.\n1. Kidney transplantation is the procedure of replacing diseased kidneys with healthy ones from donors through surgery in patients with end-stage renal disease.\n2. Kidney transplantation does not involve the removal of the original kidney but instead involves adding a new kidney to the left or right iliac fossa under the muscle layer of the lower abdominal wall. Therefore, kidney transplantation is actually a \'kidney addition\' surgery.\n3. The sources of transplanted kidneys mainly include cadaveric kidneys and living-donor kidneys. Living-donor kidneys can come from relatives such as siblings, parents, children, or spouses or from strangers who voluntarily donate their kidneys.\n4. Kidney transplantation is not the earlier, the better. Patients need to follow the doctor\'s treatment plan, actively cooperate with the doctor\'s treatment, adjust their overall physical condition to a good controlled state before considering undergoing kidney transplantation surgery.\n5. Not everyone is suitable for kidney transplantation. Patients with active hepatitis; coronary heart disease, unstable angina; active peptic ulcer disease; active chronic infection foci in the body; malignancy with metastasis or within two years of onset; abnormal coagulation function; psychiatric illness, and drug addiction are not eligible for kidney transplantation.\n6. Patients can usually be discharged from the hospital 10 days to 2 weeks after kidney transplantation. However, if various complications occur during hospitalization, the length of stay will be correspondingly prolonged, and peritoneal dialysis or hemodialysis needs to be continued, waiting for the transplanted kidney function to gradually recover.\n7. The rejection reaction after kidney transplantation is the main reason for the loss of function of the transplanted kidney. In addition, infection is also the \'number one killer\' that threatens the lives of postoperative patients. Other common complications include diabetes, hyperlipidemia, hypertension, hyperuricemia, diarrhea, anemia, and malignancy.\n8. Kidney transplant patients must take immunosuppressive drugs for life as long as the transplanted kidney is functioning. The dosage and form of the medication must comply with the doctor\'s instructions, and the dosage should be adjusted under the guidance of the doctor. It is not allowed to increase or decrease the dosage without permission.\n9. In terms of drinking water, after kidney transplantation, when blood creatinine levels drop to normal, daily urine output is greater than or equal to 1000 or even 1500 milliliters, there is no edema, and the function of the transplanted kidney is normal, patients can drink about 2000 to 2500 milliliters of water daily. If blood creatinine levels are high, and daily urine output is less than 1000 milliliters accompanied by edema, the daily water intake should be equal to the previous day\'s urine output plus 600 to 700 milliliters.\n10. The basic dietary principles for post-kidney transplant patients are to supplement moderate amounts of high-quality protein, low fat, low cholesterol, low sugar, and low salt, and to appropriately supplement minerals and vitamins. High-quality protein is generally recommended to be consumed at a rate of 1-1.2 grams per kilogram of body weight per day. The total daily intake of fat should be controlled within 60 grams, and the intake of cholesterol should be controlled below 300 milligrams. Patients with high blood pressure should control their daily salt intake to around 2-3 grams, while those with normal blood pressure can have up to 6 grams.\n11. It is recommended that kidney transplant patients should wait at least three months after surgery before having sexual intercourse. During sexual intercourse, they should avoid squeezing the transplanted kidney, and the frequency should not be too frequent to prevent excessive fatigue, which may affect the function of the transplanted kidney.\n12. After transplantation, if kidney function is stable for 18 months, the overall physical condition is generally good, with no high blood pressure or proteinuria, and the blood creatinine level is below 177 μmol/L. Long-term low-dose immunosuppressants should be used. Patients who do not take drugs that can cause fetal malformations can have a normal pregnancy under the guidance of a doctor.\n13. If the patient\'s recovery is good, there are no discomforts, and kidney function is checked multiple times without abnormalities, then they can begin to engage in light physical work three months later.\n14. Regarding the survival rate after kidney transplantation, it is difficult to reach a unified conclusion due to differences in the patient\'s condition, the timing of the transplant, and the source of the donor. Generally speaking, if the patient\'s personal situation is good, they follow-up regularly, adhere to medication, and have a reasonable diet, they can usually survive for at least ten years or more.','https://th.bing.com/th/id/OIP.hjB2DjLvmIycZMtK5H0hngHaEi?w=275&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7','001'),(3,'informations and cost about kidney transplantation','2021-08-28 19:56:00',1,'I am a patient who underwent kidney transplantation over three months ago. I am now writing about my experience and the process of kidney transplantation. If it can help you, I would be very happy. The following are personal opinions and only represent my personal understanding. Please do not criticize and take them only as a reference. The incident is based on my personal experience.\nIn February 2021, I felt breathless while walking and always felt uncomfortable after a few steps. Then I felt dizzy, like nearsightedness. My husband took me to the local hospital for an examination, and the conclusion was pleural effusion. The specific reason had to be diagnosed after hospitalization. Since People\'s Hospital in Lintong was not very authoritative, the hospital asked me to go to Xi\'an Jiaotong University Hospital without delaying the treatment. I thought I might be finished, and they were not confident either. We rushed to Tangdu Hospital overnight. We didn\'t know which department to go to, so we chose the emergency department. Since my mental state was indeed very poor at that time, the nurses in Tangdu saved me a lot but spent a lot of unnecessary money. But we had no choice because we really didn\'t know which department to go to, nor did we have any experience. I underwent a full-body examination in the emergency department at Tangdu, and all the expenses were out of pocket. I was arranged to stay in the observation room at night. My blood pressure was very high, as high as more than 200. The director of the emergency department diagnosed me with kidney failure the next day. I really couldn\'t believe my ears at that time. I had no concept of this disease. Even in daily advertisements, I hadn\'t heard of this word. At that time, it was during the epidemic, and there were no beds in the nephrology department, and I couldn\'t be arranged in the emergency department either. So we begged for help everywhere, and the next day we were admitted to the hospital. At least hospitalization can be reimbursed, so I was still very happy and relieved at that time.\nAfter being admitted to the hospital, the doctor checked all the indicators and prescribed many medicines. I have never taken so many medicines in my life. I was really psychologically very, very collapsed at that time. My mother came to find me, and the two of us were crying downstairs. The feeling in my heart was really bad. I stayed in the hospital for ten days, and all the indicators did not improve. My creatinine level was getting higher and higher, and my whole face was swollen so much that I couldn\'t recognize myself. In the end, the doctor had no choice but to start blood dialysis. I was super resistant to it at that time, but there was no way. Only through blood dialysis could toxins and water in my body be discharged, and the heart would not bear too much pressure. The doctor performed a semi-permanent venous catheterization, and the pain tolerance varies from person to person. Personally, I think it was okay for a small surgery. After blood dialysis, my whole body was obviously much better, and I had an appetite.\nAfter being discharged from the hospital, we started to learn about the issues related to transplantation. Xi\'an Jiaotong University Affiliated Hospital has a dedicated department for kidney transplantation. At that time, I was undergoing regular dialysis in Lintong. The dietary precautions during dialysis included blanching all vegetables, avoiding all nuts, fruits with high potassium levels, and fruits with skins. For example, apple skins had to be removed as potassium levels would decrease once the skin was removed. All pickled food should be avoided, and salt and oil should be used sparingly. Spicy food should be eaten less, and nutrition should be maintained. During dialysis, toxins and nutrients are removed from the body, and carbonated drinks, beer, and cigarettes should be avoided. Water should also be consumed sparingly. If thirsty, it is better to hold the water in the mouth and spit it out. During dialysis, only potassium, phosphorus, and blood pressure levels are monitored. High levels of potassium and blood pressure can damage the heart, which can affect transplantation. High levels of phosphorus can cause itching, so one must strictly control their diet. Before dialysis, one can indulge a little, such as by eating some fruit. However, one must control their diet to avoid any issues. All indicators are closely related to kidney transplantation and must be taken seriously. Psychological issues also need to be considered. If you always feel like a patient during dialysis or after transplantation, you will never recover. You must accept this disease psychologically. Eating a balanced diet is important, and controlling your diet will help improve your condition.\nWe went to the kidney transplantation department at Xi\'an Jiaotong University Affiliated Hospital. At that time, I chose to see the director. The doctor issued a hospitalization certificate, and I contacted the nurses to arrange for a hospital stay for typing. If you choose this hospital, you can download the Intelligent Good Hospital app and register online easily. My typing went smoothly because I was young and had a short dialysis time, so all my indicators were good. However, the department is afraid of infection, so there can be no caregivers. You have to take care of yourself, so you need to be strong mentally. I was discharged after three days of examination. The nurse arranged for me to join a WeChat group. There were many people in the group, ranging from 300 to 500 people. I was surprised to find so many people with the same condition. The nurse instructed us to follow the group\'s messages. They divided the group into two, and if they said that Type B could not eat, then as a Type B, you should avoid eating or drinking. This is because the computer will match your donor and check if you are a suitable match. You must be obedient. If you are matched, you can ignore it for the first month, but you must pay attention after that. During the waiting period, you must undergo regular dialysis and visit the hospital once a month for a check-up. You can register, make appointments, and pay online using the Intelligent Good Hospital app. The results will also be uploaded online every three months.\nI have undergone two checks and was preparing for a major examination when luck came my way - a suitable kidney source was found for me. That evening, the doctor called me urgently and asked me to come to the hospital as soon as possible. If you are from out of town, it is recommended to rent a house near the hospital about three months in advance. We live nearby, so it only takes an hour to drive there. The cost is no less than 300,000 yuan, which will be charged to your hospitalization card. Therefore, be sure to prepare a card with an unlimited balance after the matching is confirmed, and remember to have no limit on the card. Otherwise, it will be troublesome if the card cannot be used. If you don\'t have enough money, the hospital may not perform the operation, so avoid these issues. There is no accompaniment allowed, so here\'s a list of things you need to prepare: a measuring straw cup, a urine pad, and sanitary pads for women to avoid stress reactions. You don\'t need to bring a toothbrush; you won\'t use it in the early stages. Just bring mouthwash. Then bring a notebook and pen to record input and output. Be sure to bring non-slip slippers. If you need anything, your family can send it to the entrance. After the preoperative checkup, the surgery will take place the next morning. I was happy and nervous at the same time. I cried a lot; I was weak. Once I entered, I didn\'t know anything for a while, but when I woke up, the first thing the doctor said was \'You peed a lot.\' Although my consciousness was blurred, I was still very happy. This was the moment my second life began. Gradually, my indicators recovered. Don\'t ask me if it was painful or not. It was definitely painful. The kidney transplant was performed in the iliac fossa of the abdomen, leaving a large scar. If you\'re a girl, I suggest you ask the doctor for cosmetic sutures. It costs a little more, but at least you won\'t have to worry about the scar. Of course, this also depends on the thickness of your fat. As for the cost, I have medical insurance as an employee, and I spent about 240,000 yuan in the hospital. The 168,000 yuan for the kidney source fee was not reimbursed, depending on local policies. Mine was not reimbursed. The cost of the lifelong immune agent medication is also very high. I applied for special approval for the medication at Jiaotong University and got the medicine from the Yikang Pharmacy across the street, not from the hospital. You can ask me privately for more information. After being discharged, I had a check-up once a week for the first month, and in the first three months, I was classified as a chronic disease and could be reimbursed for most of the expenses. So, the later expenses were not too bad; it cost me about 1,500 yuan per month.','https://th.bing.com/th/id/OIP.EfCKJ9WluXXfvZ2Eli5CIgHaE8?w=234&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7','001');
/*!40000 ALTER TABLE `t_news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_riskwarning`
--

DROP TABLE IF EXISTS `t_riskwarning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_riskwarning` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `rcode` varchar(36) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `did` int DEFAULT NULL,
  `rtitle` varchar(100) DEFAULT NULL,
  `rcontent` varchar(1000) DEFAULT NULL,
  `rtime` datetime DEFAULT NULL,
  `rstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `rcode` (`rcode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_riskwarning`
--

LOCK TABLES `t_riskwarning` WRITE;
/*!40000 ALTER TABLE `t_riskwarning` DISABLE KEYS */;
INSERT INTO `t_riskwarning` VALUES (1,'testRiskWarning_001',1,1,'testRiskWarningTitle_001','This the description of the riskWarning called testRiskWarning_001 for testing only.','2022-05-27 20:30:00','001'),(2,'testRiskWarning_002',1,2,'testRiskWarningTitle_002','This the description of the riskWarning called testRiskWarning_002 for testing only.','2023-01-09 08:15:00','001'),(3,'testRiskWarning_003',1,1,'testRiskWarningTitle_003','This the description of the riskWarning called testRiskWarning_003 for testing only.','2023-04-23 16:14:58','001');
/*!40000 ALTER TABLE `t_riskwarning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_status`
--

DROP TABLE IF EXISTS `t_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_status` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `scode` varchar(36) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `scontent` varchar(1000) DEFAULT NULL,
  `stime` datetime DEFAULT NULL,
  `lowTemp` decimal(10,2) DEFAULT NULL,
  `highTemp` decimal(10,2) DEFAULT NULL,
  `currentTemp` decimal(10,2) DEFAULT NULL,
  `simage` varchar(300) DEFAULT NULL,
  `sstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `scode` (`scode`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_status`
--

LOCK TABLES `t_status` WRITE;
/*!40000 ALTER TABLE `t_status` DISABLE KEYS */;
INSERT INTO `t_status` VALUES (1,'testStatus_001',1,'This the content of the status called testStatus_001 for testing only.','2023-04-18 17:13:28',36.10,36.90,36.50,'#','001'),(2,'testStatus_002',1,'This the content of the status called testStatus_002 for testing only.','2023-04-27 19:46:13',35.80,36.70,36.10,'#','001');
/*!40000 ALTER TABLE `t_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_symptom`
--

DROP TABLE IF EXISTS `t_symptom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_symptom` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `scode` varchar(36) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `scontent` varchar(1000) DEFAULT NULL,
  `stime` datetime DEFAULT NULL,
  `sstate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `scode` (`scode`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_symptom`
--

LOCK TABLES `t_symptom` WRITE;
/*!40000 ALTER TABLE `t_symptom` DISABLE KEYS */;
INSERT INTO `t_symptom` VALUES (1,'testSymptom_001',1,'This the content of the symptom called testSymptom_001 for testing only.','2023-04-18 17:13:11','001');
/*!40000 ALTER TABLE `t_symptom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `ucode` varchar(36) DEFAULT NULL,
  `uname` varchar(30) DEFAULT NULL,
  `upassword` varchar(30) DEFAULT NULL,
  `uavatar` varchar(1000) DEFAULT NULL,
  `urealname` varchar(30) DEFAULT NULL,
  `ugender` varchar(10) DEFAULT NULL,
  `ubirthday` date DEFAULT NULL,
  `utel` varchar(20) DEFAULT NULL,
  `uidentity` varchar(30) DEFAULT NULL,
  `ustate` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `ucode` (`ucode`),
  UNIQUE KEY `utel` (`utel`),
  UNIQUE KEY `uidentity` (`uidentity`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'testUser_001','zs123','123','https://img.51miz.com/Element/00/90/00/41/b97e9b67_E900041_54c1f106.png','zhangsan','male','2001-05-27','19859135736','350702200105270004','001'),(6,'d8651d27-e832-4694-82dd-27dffc9580ff','zhaoliu666','666','http://tmp/BqmLEAvSC72i4c8aeb8645009b47781e32baaaf9a2f3.jpg','zhaoliu','male','2003-08-27','11188889999','11114444777755','001');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user_medicine`
--

DROP TABLE IF EXISTS `t_user_medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_user_medicine` (
  `uid` int DEFAULT NULL,
  `mid` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_medicine`
--

LOCK TABLES `t_user_medicine` WRITE;
/*!40000 ALTER TABLE `t_user_medicine` DISABLE KEYS */;
INSERT INTO `t_user_medicine` VALUES (1,1),(1,3);
/*!40000 ALTER TABLE `t_user_medicine` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-28 20:57:44
