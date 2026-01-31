package fr.spacefox.perftests.quarkus.data.entity577;

import fr.spacefox.perftests.quarkus.core.port.data.Entity577DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service577.model.Model577;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity577Repository implements Entity577DatasourcePort, PanacheRepository<Entity577> {
    @Override
    public Optional<Model577> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
