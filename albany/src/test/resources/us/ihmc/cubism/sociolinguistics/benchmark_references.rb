require 'nokogiri'

doc = File.read '/Users/adalton/code/ihmc/adept/v4/deft/ihmc/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/Alana_cheney_merged.xml'

xml = Nokogiri::XML.parse(doc)

turns = xml.css('turn')

count = 0

 f = File.open('/Users/adalton/code/ihmc/adept/v4/deft/ihmc/src/test/resources/us/ihmc/cubism/sociolinguistics/reference.benchmark/polarity.txt', 'w+')
turns.each_with_index{|t,i| f.puts "#{t.attributes['speaker']}\t#{t.attributes['polarity']}\t#{i}" unless t.attributes['polarity'].text.empty?}; nil
 f.close

 f = File.open('/Users/adalton/code/ihmc/adept/v4/deft/ihmc/src/test/resources/us/ihmc/cubism/sociolinguistics/reference.benchmark/topic.txt', 'w+')
turns.each_with_index{|t,i|
f.puts "#{t.attributes['speaker']}\t#{t.attributes['topic']}\t#{i}" unless t.attributes['topic'].text.empty?}; nil
 f.close

 f = File.open('/Users/adalton/code/ihmc/adept/v4/deft/ihmc/src/test/resources/us/ihmc/cubism/sociolinguistics/reference.benchmark/topic.count', 'w+')
 f.puts(turns.size)
 f.close

 f = File.open('/Users/adalton/code/ihmc/adept/v4/deft/ihmc/src/test/resources/us/ihmc/cubism/sociolinguistics/reference.benchmark/polarity.count', 'w+')
 f.puts(turns.size)
 f.close

