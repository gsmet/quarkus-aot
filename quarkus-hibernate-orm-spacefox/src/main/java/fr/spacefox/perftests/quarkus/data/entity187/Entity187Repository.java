package fr.spacefox.perftests.quarkus.data.entity187;

import fr.spacefox.perftests.quarkus.core.port.data.Entity187DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service187.model.Model187;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity187Repository implements Entity187DatasourcePort, PanacheRepository<Entity187> {
    @Override
    public Optional<Model187> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
