package fr.spacefox.perftests.quarkus.rest.endpoint97;

import fr.spacefox.perftests.quarkus.core.service97.model.Model97;
import fr.spacefox.perftests.quarkus.rest.endpoint97.schema.Schema97;

final class Mapper {
    private Mapper() {}

    public static Schema97 of(Model97 model) {
        return new Schema97(model.id(), model.value());
    }
}
