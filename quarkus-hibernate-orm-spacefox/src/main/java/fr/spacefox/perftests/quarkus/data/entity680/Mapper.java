package fr.spacefox.perftests.quarkus.data.entity680;

import fr.spacefox.perftests.quarkus.core.service680.model.Model680;

final class Mapper {
    private Mapper() {}

    public static Model680 of(Entity680 entity) {
        return new Model680(entity.getId(), entity.getField());
    }
}
