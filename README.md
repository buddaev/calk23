# Создание CSV файла
with open(file_path, mode='w', newline='', encoding='utf-8') as file:
    writer = csv.DictWriter(file, fieldnames=headers)
    writer.writeheader()
    for event in events:
        writer.writerow({
            "Subject": event["Subject"],
            "Start Date": event["Start Date"],
            "Start Time": "",
            "End Date": event["End Date"],
            "End Time": "",
            "All Day Event": event["All Day Event"],
            "Description": "",
            "Location": "",
            "Private": "True"
ader() for event in events: writer.writerow({ "Subject": event["Subject"], "Start Date": event["Start Date"], "Start Time": "", "End Date": event["En
