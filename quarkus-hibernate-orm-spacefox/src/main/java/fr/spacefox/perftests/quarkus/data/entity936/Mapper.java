package fr.spacefox.perftests.quarkus.data.entity936;

import fr.spacefox.perftests.quarkus.core.service936.model.Model936;

final class Mapper {
    private Mapper() {}

    public static Model936 of(Entity936 entity) {
        return new Model936(entity.getId(), entity.getField());
    }
}
