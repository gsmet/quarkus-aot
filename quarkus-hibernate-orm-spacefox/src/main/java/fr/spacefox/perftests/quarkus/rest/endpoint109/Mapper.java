package fr.spacefox.perftests.quarkus.rest.endpoint109;

import fr.spacefox.perftests.quarkus.core.service109.model.Model109;
import fr.spacefox.perftests.quarkus.rest.endpoint109.schema.Schema109;

final class Mapper {
    private Mapper() {}

    public static Schema109 of(Model109 model) {
        return new Schema109(model.id(), model.value());
    }
}
