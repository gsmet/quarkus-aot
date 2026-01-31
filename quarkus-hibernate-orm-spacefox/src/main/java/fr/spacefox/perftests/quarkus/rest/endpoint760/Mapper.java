package fr.spacefox.perftests.quarkus.rest.endpoint760;

import fr.spacefox.perftests.quarkus.core.service760.model.Model760;
import fr.spacefox.perftests.quarkus.rest.endpoint760.schema.Schema760;

final class Mapper {
    private Mapper() {}

    public static Schema760 of(Model760 model) {
        return new Schema760(model.id(), model.value());
    }
}
