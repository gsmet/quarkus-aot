package fr.spacefox.perftests.quarkus.data.entity857;

import fr.spacefox.perftests.quarkus.core.service857.model.Model857;

final class Mapper {
    private Mapper() {}

    public static Model857 of(Entity857 entity) {
        return new Model857(entity.getId(), entity.getField());
    }
}
