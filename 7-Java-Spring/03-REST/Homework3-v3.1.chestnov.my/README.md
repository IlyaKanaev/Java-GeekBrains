#1. Повторить все, что на семинаре

#2. В объект timesheet в поле createdAt подставлять текущее время сервера, т.е не клиент присылает, а сервер устанавливает

#3. Создать отдельный контроллер для проектов (поле Timesheet.project)

3.1 Создать класс Project с полями id, name

3.2 Создать CRUD-контроллер для класса Project, сервис и репозиторий

3.3 В классе (ресурсе) Timesheet поле project заменить на projectId

3.4 При создании Timesheet проверять, что project с идентификатором projectId существует

#4*. Создать ресурс /projects/{id}/timesheets - загрузить timesheets для конкретного проекта

#5*. Создать ресурс /timesheets?createdAtAfter=YYYY-MM-DD - ручка для получения всех таймшитов, созданных после указанного срока (параметра)

#Аналогично создать ресурс /timesheets?createdAtBefore=YYYY-MM-DD для получения всех таймшитов, созданных до указанного срока