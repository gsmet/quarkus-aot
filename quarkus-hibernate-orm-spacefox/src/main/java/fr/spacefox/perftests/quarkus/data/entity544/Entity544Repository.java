package fr.spacefox.perftests.quarkus.data.entity544;

import fr.spacefox.perftests.quarkus.core.port.data.Entity544DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service544.model.Model544;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity544Repository implements Entity544DatasourcePort, PanacheRepository<Entity544> {
    @Override
    public Optional<Model544> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
