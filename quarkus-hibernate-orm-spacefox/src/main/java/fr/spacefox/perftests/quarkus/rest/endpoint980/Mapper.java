package fr.spacefox.perftests.quarkus.rest.endpoint980;

import fr.spacefox.perftests.quarkus.core.service980.model.Model980;
import fr.spacefox.perftests.quarkus.rest.endpoint980.schema.Schema980;

final class Mapper {
    private Mapper() {}

    public static Schema980 of(Model980 model) {
        return new Schema980(model.id(), model.value());
    }
}
