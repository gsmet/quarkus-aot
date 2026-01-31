package fr.spacefox.perftests.quarkus.data.entity322;

import fr.spacefox.perftests.quarkus.core.service322.model.Model322;

final class Mapper {
    private Mapper() {}

    public static Model322 of(Entity322 entity) {
        return new Model322(entity.getId(), entity.getField());
    }
}
