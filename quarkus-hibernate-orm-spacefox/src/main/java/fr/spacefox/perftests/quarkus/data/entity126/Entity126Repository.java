package fr.spacefox.perftests.quarkus.data.entity126;

import fr.spacefox.perftests.quarkus.core.port.data.Entity126DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service126.model.Model126;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity126Repository implements Entity126DatasourcePort, PanacheRepository<Entity126> {
    @Override
    public Optional<Model126> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
