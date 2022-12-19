namespace PaycheckHelp
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.btn_calculate = new System.Windows.Forms.Button();
            this.totalHoursTextBox = new System.Windows.Forms.TextBox();
            this.internationalPerDiemTextBox = new System.Windows.Forms.TextBox();
            this.domesticPerDiemTextBox = new System.Windows.Forms.TextBox();
            this.paycheckAmountTextBox = new System.Windows.Forms.TextBox();
            this.totalHoursLabel = new System.Windows.Forms.Label();
            this.domesticPerDiemLabel = new System.Windows.Forms.Label();
            this.internationalPerDiemLlabel = new System.Windows.Forms.Label();
            this.welcome = new System.Windows.Forms.Label();
            this.instructions = new System.Windows.Forms.Label();
            this.btn_clear = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btn_calculate
            // 
            this.btn_calculate.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_calculate.Location = new System.Drawing.Point(305, 708);
            this.btn_calculate.Margin = new System.Windows.Forms.Padding(5);
            this.btn_calculate.Name = "btn_calculate";
            this.btn_calculate.Size = new System.Drawing.Size(204, 86);
            this.btn_calculate.TabIndex = 3;
            this.btn_calculate.Text = "Calculate";
            this.btn_calculate.UseVisualStyleBackColor = true;
            this.btn_calculate.Click += new System.EventHandler(this.btn_calculate_Click);
            // 
            // totalHoursTextBox
            // 
            this.totalHoursTextBox.Location = new System.Drawing.Point(169, 259);
            this.totalHoursTextBox.Margin = new System.Windows.Forms.Padding(5);
            this.totalHoursTextBox.Name = "totalHoursTextBox";
            this.totalHoursTextBox.Size = new System.Drawing.Size(743, 44);
            this.totalHoursTextBox.TabIndex = 0;
            // 
            // internationalPerDiemTextBox
            // 
            this.internationalPerDiemTextBox.Location = new System.Drawing.Point(169, 552);
            this.internationalPerDiemTextBox.Margin = new System.Windows.Forms.Padding(5);
            this.internationalPerDiemTextBox.Name = "internationalPerDiemTextBox";
            this.internationalPerDiemTextBox.Size = new System.Drawing.Size(743, 44);
            this.internationalPerDiemTextBox.TabIndex = 2;
            // 
            // domesticPerDiemTextBox
            // 
            this.domesticPerDiemTextBox.Location = new System.Drawing.Point(169, 406);
            this.domesticPerDiemTextBox.Margin = new System.Windows.Forms.Padding(5);
            this.domesticPerDiemTextBox.Name = "domesticPerDiemTextBox";
            this.domesticPerDiemTextBox.Size = new System.Drawing.Size(743, 44);
            this.domesticPerDiemTextBox.TabIndex = 1;
            // 
            // paycheckAmountTextBox
            // 
            this.paycheckAmountTextBox.Location = new System.Drawing.Point(169, 881);
            this.paycheckAmountTextBox.Margin = new System.Windows.Forms.Padding(3, 3, 3, 50);
            this.paycheckAmountTextBox.Name = "paycheckAmountTextBox";
            this.paycheckAmountTextBox.Size = new System.Drawing.Size(743, 44);
            this.paycheckAmountTextBox.TabIndex = 5;
            // 
            // totalHoursLabel
            // 
            this.totalHoursLabel.AutoSize = true;
            this.totalHoursLabel.BackColor = System.Drawing.Color.Transparent;
            this.totalHoursLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.totalHoursLabel.Location = new System.Drawing.Point(422, 330);
            this.totalHoursLabel.Margin = new System.Windows.Forms.Padding(5);
            this.totalHoursLabel.Name = "totalHoursLabel";
            this.totalHoursLabel.Padding = new System.Windows.Forms.Padding(3);
            this.totalHoursLabel.Size = new System.Drawing.Size(209, 46);
            this.totalHoursLabel.TabIndex = 5;
            this.totalHoursLabel.Text = "Total Hours";
            this.totalHoursLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // domesticPerDiemLabel
            // 
            this.domesticPerDiemLabel.AutoSize = true;
            this.domesticPerDiemLabel.BackColor = System.Drawing.Color.Transparent;
            this.domesticPerDiemLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.domesticPerDiemLabel.Location = new System.Drawing.Point(253, 472);
            this.domesticPerDiemLabel.Margin = new System.Windows.Forms.Padding(5);
            this.domesticPerDiemLabel.Name = "domesticPerDiemLabel";
            this.domesticPerDiemLabel.Padding = new System.Windows.Forms.Padding(3);
            this.domesticPerDiemLabel.Size = new System.Drawing.Size(529, 46);
            this.domesticPerDiemLabel.TabIndex = 6;
            this.domesticPerDiemLabel.Text = "Total Domestic Per Diem Hours";
            this.domesticPerDiemLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // internationalPerDiemLlabel
            // 
            this.internationalPerDiemLlabel.BackColor = System.Drawing.Color.Transparent;
            this.internationalPerDiemLlabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.internationalPerDiemLlabel.Location = new System.Drawing.Point(221, 616);
            this.internationalPerDiemLlabel.Margin = new System.Windows.Forms.Padding(5);
            this.internationalPerDiemLlabel.Name = "internationalPerDiemLlabel";
            this.internationalPerDiemLlabel.Padding = new System.Windows.Forms.Padding(3);
            this.internationalPerDiemLlabel.Size = new System.Drawing.Size(610, 46);
            this.internationalPerDiemLlabel.TabIndex = 7;
            this.internationalPerDiemLlabel.Text = "Total International Per Diem Hours";
            this.internationalPerDiemLlabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // welcome
            // 
            this.welcome.AutoSize = true;
            this.welcome.BackColor = System.Drawing.Color.Transparent;
            this.welcome.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.welcome.Location = new System.Drawing.Point(91, 44);
            this.welcome.Margin = new System.Windows.Forms.Padding(5);
            this.welcome.Name = "welcome";
            this.welcome.Padding = new System.Windows.Forms.Padding(5);
            this.welcome.Size = new System.Drawing.Size(921, 50);
            this.welcome.TabIndex = 8;
            this.welcome.Text = "Welcome to your middle-of-the-month paycheck helper! ";
            // 
            // instructions
            // 
            this.instructions.AutoSize = true;
            this.instructions.BackColor = System.Drawing.Color.Transparent;
            this.instructions.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.instructions.Location = new System.Drawing.Point(111, 124);
            this.instructions.Margin = new System.Windows.Forms.Padding(5);
            this.instructions.Name = "instructions";
            this.instructions.Padding = new System.Windows.Forms.Padding(5);
            this.instructions.Size = new System.Drawing.Size(867, 50);
            this.instructions.TabIndex = 9;
            this.instructions.Text = "Enter your information below (All fields are required).";
            // 
            // btn_clear
            // 
            this.btn_clear.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_clear.Location = new System.Drawing.Point(597, 708);
            this.btn_clear.Margin = new System.Windows.Forms.Padding(5);
            this.btn_clear.Name = "btn_clear";
            this.btn_clear.Size = new System.Drawing.Size(204, 86);
            this.btn_clear.TabIndex = 6;
            this.btn_clear.Text = "Clear";
            this.btn_clear.UseVisualStyleBackColor = true;
            this.btn_clear.Click += new System.EventHandler(this.btn_clear_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(288F, 288F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Dpi;
            this.AutoScroll = true;
            this.AutoSize = true;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1135, 947);
            this.Controls.Add(this.btn_clear);
            this.Controls.Add(this.instructions);
            this.Controls.Add(this.welcome);
            this.Controls.Add(this.internationalPerDiemLlabel);
            this.Controls.Add(this.domesticPerDiemLabel);
            this.Controls.Add(this.totalHoursLabel);
            this.Controls.Add(this.paycheckAmountTextBox);
            this.Controls.Add(this.domesticPerDiemTextBox);
            this.Controls.Add(this.internationalPerDiemTextBox);
            this.Controls.Add(this.totalHoursTextBox);
            this.Controls.Add(this.btn_calculate);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MinimumSize = new System.Drawing.Size(45, 107);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Paycheck Helper";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btn_calculate;
        private System.Windows.Forms.TextBox totalHoursTextBox;
        private System.Windows.Forms.TextBox internationalPerDiemTextBox;
        private System.Windows.Forms.TextBox domesticPerDiemTextBox;
        private System.Windows.Forms.TextBox paycheckAmountTextBox;
        private System.Windows.Forms.Label totalHoursLabel;
        private System.Windows.Forms.Label domesticPerDiemLabel;
        private System.Windows.Forms.Label internationalPerDiemLlabel;
        private System.Windows.Forms.Label welcome;
        private System.Windows.Forms.Label instructions;
        private System.Windows.Forms.Button btn_clear;
    }
}

