package fr.spacefox.perftests.quarkus.data.entity583;

import fr.spacefox.perftests.quarkus.core.port.data.Entity583DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service583.model.Model583;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity583Repository implements Entity583DatasourcePort, PanacheRepository<Entity583> {
    @Override
    public Optional<Model583> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
