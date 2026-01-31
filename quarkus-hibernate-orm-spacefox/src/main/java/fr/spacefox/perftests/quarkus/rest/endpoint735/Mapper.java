package fr.spacefox.perftests.quarkus.rest.endpoint735;

import fr.spacefox.perftests.quarkus.core.service735.model.Model735;
import fr.spacefox.perftests.quarkus.rest.endpoint735.schema.Schema735;

final class Mapper {
    private Mapper() {}

    public static Schema735 of(Model735 model) {
        return new Schema735(model.id(), model.value());
    }
}
