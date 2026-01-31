package fr.spacefox.perftests.quarkus.data.entity397;

import fr.spacefox.perftests.quarkus.core.port.data.Entity397DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service397.model.Model397;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity397Repository implements Entity397DatasourcePort, PanacheRepository<Entity397> {
    @Override
    public Optional<Model397> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
