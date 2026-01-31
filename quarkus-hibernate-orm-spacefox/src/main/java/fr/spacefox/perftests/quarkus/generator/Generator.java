package fr.spacefox.perftests.quarkus.generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {

    private static final String ROOT_PATH = "/home/gsmet/git/perftests-quarkus/src";
    private static final String MAIN_PATH = ROOT_PATH + "/main";
    private static final String JAVA_PATH = MAIN_PATH + "/java";
    private static final String MAIN_TO_CLEAN_PATH = JAVA_PATH + "/fr/spacefox/perftests/quarkus";
    private static final String TEST_PATH = ROOT_PATH + "/test/java";
    private static final String TEST_TO_CLEAN_PATH = TEST_PATH + "/fr/spacefox/perftests/quarkus";
    private static final String RESOURCES_PATH = MAIN_PATH + "/resources";
    private static final int ELEMENTS = 1000;

    private final int nbEntities;
    private final int nbServices;
    private final int nbResources;

    private final List<Entity> entities = new ArrayList<>();
    private final List<Service> services = new ArrayList<>();
    private final List<Resource> resources = new ArrayList<>();

    public Generator(int nbEntities, int nbServices, int nbResources) {
        this.nbEntities = nbEntities;
        this.nbServices = nbServices;
        this.nbResources = nbResources;
    }

    public static void main(String[] args) throws IOException {
        new Generator(ELEMENTS, ELEMENTS, ELEMENTS).generate();
    }

    private void generate() throws IOException {
        resetStructure();

        for (int i = 0; i < nbEntities; i++) {
            generateEntity(i);
        }

        for (int i = 0; i < nbServices; i++) {
            generateService(i);
        }

        for (int i = 0; i < nbResources; i++) {
            generateResource(i);
        }

        generateInitData();
    }

    private void resetStructure() throws IOException {
        cleanPath(Path.of(MAIN_TO_CLEAN_PATH, "core"));
        cleanPath(Path.of(MAIN_TO_CLEAN_PATH, "data"));
        cleanPath(Path.of(MAIN_TO_CLEAN_PATH, "rest"));
        cleanPath(Path.of(TEST_TO_CLEAN_PATH));
    }

    private static void cleanPath(Path path) throws IOException {
        Files.createDirectories(path);
        try (Stream<Path> paths = Files.walk(path)) {
            paths.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
        }
    }

    private void generateEntity(int i) throws IOException {
        final var entity = new Entity(i);
        entities.add(entity);
        entity.writeFiles();
    }

    private void generateService(int i) throws IOException {
        final var service = new Service(i);
        services.add(service);
        service.writeFiles();
    }

    private void generateResource(int i) throws IOException {
        final var resource = new Resource(i);
        resources.add(resource);
        resource.writeFiles();
    }

    private void generateInitData() throws IOException {
        final var sql = entities.stream()
                .map(entity ->
                        "insert into %s (id, field) values (1, '%s n°1');".formatted(entity.varName(), entity.name()))
                .collect(Collectors.joining("\n"));
        Files.writeString(Path.of(RESOURCES_PATH + "/import.sql"), sql);
    }

    static String validAbsolutePath(String pkgName) throws IOException {
        final var absolutePath = JAVA_PATH + "/" + pkgName.replace(".", "/");
        Files.createDirectories(Path.of(absolutePath));
        return absolutePath;
    }

    static String validAbsoluteTestPath(String pkgName) throws IOException {
        final var absolutePath = TEST_PATH + "/" + pkgName.replace(".", "/");
        Files.createDirectories(Path.of(absolutePath));
        return absolutePath;
    }
}
