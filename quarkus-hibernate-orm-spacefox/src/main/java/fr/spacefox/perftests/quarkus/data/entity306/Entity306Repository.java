package fr.spacefox.perftests.quarkus.data.entity306;

import fr.spacefox.perftests.quarkus.core.port.data.Entity306DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service306.model.Model306;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity306Repository implements Entity306DatasourcePort, PanacheRepository<Entity306> {
    @Override
    public Optional<Model306> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
