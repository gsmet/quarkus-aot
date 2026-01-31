package fr.spacefox.perftests.quarkus.data.entity647;

import fr.spacefox.perftests.quarkus.core.port.data.Entity647DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service647.model.Model647;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity647Repository implements Entity647DatasourcePort, PanacheRepository<Entity647> {
    @Override
    public Optional<Model647> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
