package fr.spacefox.perftests.quarkus.rest.endpoint863;

import fr.spacefox.perftests.quarkus.core.service863.model.Model863;
import fr.spacefox.perftests.quarkus.rest.endpoint863.schema.Schema863;

final class Mapper {
    private Mapper() {}

    public static Schema863 of(Model863 model) {
        return new Schema863(model.id(), model.value());
    }
}
