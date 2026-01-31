package fr.spacefox.perftests.quarkus.rest.endpoint974;

import fr.spacefox.perftests.quarkus.core.service974.model.Model974;
import fr.spacefox.perftests.quarkus.rest.endpoint974.schema.Schema974;

final class Mapper {
    private Mapper() {}

    public static Schema974 of(Model974 model) {
        return new Schema974(model.id(), model.value());
    }
}
