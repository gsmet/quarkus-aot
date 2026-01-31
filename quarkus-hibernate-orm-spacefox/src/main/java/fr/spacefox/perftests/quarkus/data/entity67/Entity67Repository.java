package fr.spacefox.perftests.quarkus.data.entity67;

import fr.spacefox.perftests.quarkus.core.port.data.Entity67DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service67.model.Model67;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity67Repository implements Entity67DatasourcePort, PanacheRepository<Entity67> {
    @Override
    public Optional<Model67> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
