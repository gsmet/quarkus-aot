package fr.spacefox.perftests.quarkus.data.entity493;

import fr.spacefox.perftests.quarkus.core.port.data.Entity493DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service493.model.Model493;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity493Repository implements Entity493DatasourcePort, PanacheRepository<Entity493> {
    @Override
    public Optional<Model493> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
