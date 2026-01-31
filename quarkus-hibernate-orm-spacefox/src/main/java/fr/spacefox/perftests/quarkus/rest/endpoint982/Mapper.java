package fr.spacefox.perftests.quarkus.rest.endpoint982;

import fr.spacefox.perftests.quarkus.core.service982.model.Model982;
import fr.spacefox.perftests.quarkus.rest.endpoint982.schema.Schema982;

final class Mapper {
    private Mapper() {}

    public static Schema982 of(Model982 model) {
        return new Schema982(model.id(), model.value());
    }
}
