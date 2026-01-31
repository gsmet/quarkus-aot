package fr.spacefox.perftests.quarkus.data.entity575;

import fr.spacefox.perftests.quarkus.core.port.data.Entity575DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service575.model.Model575;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity575Repository implements Entity575DatasourcePort, PanacheRepository<Entity575> {
    @Override
    public Optional<Model575> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
