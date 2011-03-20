# iTax - Income Tax Calculator for Bangladesh

## Overview

iTax is a web-based income tax calculation system designed specifically for Bangladeshi individuals and non-corporate taxpayers. This application streamlines the traditionally complex and time-consuming process of calculating income tax by automating calculations and generating official tax forms.

## Product Perspective

Income tax calculation in Bangladesh has traditionally been a lengthy and complex manual process, prone to errors and requiring significant time investment. Taxpayers must navigate multiple income categories, understand various criteria, obtain physical forms, and perform intricate calculations by hand.

**iTax transforms this process by:**
- Automating complex tax calculations
- Providing an intuitive web interface accessible from anywhere
- Eliminating manual calculation errors
- Saving significant time and effort
- Generating properly formatted tax documents instantly

## Key Features

### 1. **User Management**
   - Secure user registration and authentication
   - Personal profile management
   - Session-based data persistence

### 2. **Comprehensive Income Data Collection**
   - General taxpayer information
   - Multiple income source categories
   - Deduction and exemption handling
   - Investment tax credit calculations

### 3. **Automated Tax Calculation**
   - Real-time tax computation based on current Bangladesh tax laws
   - Support for various taxpayer categories (individuals and non-corporate entities)
   - Accurate calculation of payable tax amounts

### 4. **Document Generation**
   - Automatic PDF form generation with pre-filled information
   - Print-ready tax return documents
   - Formatted according to NBR (National Board of Revenue) standards

## User Workflow

1. **Registration/Login**: Users begin by creating an account or logging into their existing profile
2. **Information Entry**: Step-by-step forms guide users through entering:
   - Personal information
   - Income details from various sources
   - Deductions and exemptions
   - Investment information
3. **Review & Calculate**: System processes all information and calculates total tax liability
4. **Document Generation**: Automatically generates a completed PDF tax form
5. **Print & Save**: Users can print or save their completed tax documents

## Project Scope

### Included Features
- ✅ Income tax calculation for individuals and non-corporate taxpayers
- ✅ Secure data storage in database
- ✅ Web-based application accessible online
- ✅ PDF tax form generation and printing
- ✅ Support for multiple income sources and deductions
- ✅ User account management

### Limitations
- ❌ Does not submit tax payments directly to NBR
- ❌ Does not support corporate tax calculations
- ❌ Requires manual submission of printed forms to tax authorities

## Technical Architecture

### Technology Stack
- **Backend**: Java with Spring MVC Framework
- **Database**: Supports both H2 (development) and MySQL (production)
- **Frontend**: JSP with Bootstrap CSS
- **Build Tool**: Maven
- **Application Server**: Compatible with Tomcat, JBoss, and other Java EE containers

### Database Configuration
The application supports flexible database configuration:
- **H2 Database**: For development and testing (zero configuration required)
- **MySQL Database**: For production deployment
- Configuration easily switchable via `db.properties` file

## Installation & Setup

### Prerequisites
- Java JDK 1.6 or higher
- Maven 3.x
- MySQL 5.x (optional, for production)
- Tomcat 7.x or compatible application server

### Quick Start
1. Clone the repository
2. Configure database settings in `src/main/resources/db.properties`
3. Build the project: `mvn clean package`
4. Deploy the generated WAR file to your application server
5. Access the application at: `http://localhost:8080/income-tax-calculator/`

## Benefits

- **Accuracy**: Eliminates manual calculation errors
- **Efficiency**: Reduces tax preparation time from hours to minutes
- **Accessibility**: Available online from any device with internet access
- **Convenience**: No need to obtain physical forms or visit tax offices
- **Documentation**: Automatically generates properly formatted tax documents
- **Cost-Effective**: Free alternative to professional tax preparation services

## Future Enhancements

Potential areas for future development include:
- Integration with NBR for direct tax submission
- Mobile application development
- Support for corporate tax calculations
- Multi-language support (Bengali interface)
- Tax planning and optimization suggestions
- Historical tax record management

## License

This project is developed for educational and personal use. Users should verify all calculations and consult with tax professionals for official tax filing.

## Support

For questions, issues, or contributions, please refer to the project documentation or contact the development team.

---

**Disclaimer**: This software is designed to assist with tax calculations but does not replace professional tax advice. Users are responsible for verifying calculations and ensuring compliance with current tax laws and regulations.