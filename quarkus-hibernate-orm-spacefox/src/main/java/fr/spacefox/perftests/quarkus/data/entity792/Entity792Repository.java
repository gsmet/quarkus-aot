package fr.spacefox.perftests.quarkus.data.entity792;

import fr.spacefox.perftests.quarkus.core.port.data.Entity792DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service792.model.Model792;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity792Repository implements Entity792DatasourcePort, PanacheRepository<Entity792> {
    @Override
    public Optional<Model792> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
