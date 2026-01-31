package fr.spacefox.perftests.quarkus.data.entity909;

import fr.spacefox.perftests.quarkus.core.port.data.Entity909DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service909.model.Model909;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity909Repository implements Entity909DatasourcePort, PanacheRepository<Entity909> {
    @Override
    public Optional<Model909> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
