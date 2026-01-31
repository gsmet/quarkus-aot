package fr.spacefox.perftests.quarkus.data.entity56;

import fr.spacefox.perftests.quarkus.core.port.data.Entity56DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service56.model.Model56;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity56Repository implements Entity56DatasourcePort, PanacheRepository<Entity56> {
    @Override
    public Optional<Model56> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
