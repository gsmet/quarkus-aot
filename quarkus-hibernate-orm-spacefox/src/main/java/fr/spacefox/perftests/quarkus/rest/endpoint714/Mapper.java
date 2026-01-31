package fr.spacefox.perftests.quarkus.rest.endpoint714;

import fr.spacefox.perftests.quarkus.core.service714.model.Model714;
import fr.spacefox.perftests.quarkus.rest.endpoint714.schema.Schema714;

final class Mapper {
    private Mapper() {}

    public static Schema714 of(Model714 model) {
        return new Schema714(model.id(), model.value());
    }
}
