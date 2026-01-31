package fr.spacefox.perftests.quarkus.data.entity99;

import fr.spacefox.perftests.quarkus.core.port.data.Entity99DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service99.model.Model99;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity99Repository implements Entity99DatasourcePort, PanacheRepository<Entity99> {
    @Override
    public Optional<Model99> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
