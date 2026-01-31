package fr.spacefox.perftests.quarkus.data.entity167;

import fr.spacefox.perftests.quarkus.core.port.data.Entity167DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service167.model.Model167;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity167Repository implements Entity167DatasourcePort, PanacheRepository<Entity167> {
    @Override
    public Optional<Model167> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
