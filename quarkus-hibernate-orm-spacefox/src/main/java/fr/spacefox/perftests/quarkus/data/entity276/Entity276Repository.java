package fr.spacefox.perftests.quarkus.data.entity276;

import fr.spacefox.perftests.quarkus.core.port.data.Entity276DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service276.model.Model276;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity276Repository implements Entity276DatasourcePort, PanacheRepository<Entity276> {
    @Override
    public Optional<Model276> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
