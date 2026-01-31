package fr.spacefox.perftests.quarkus.data.entity868;

import fr.spacefox.perftests.quarkus.core.port.data.Entity868DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service868.model.Model868;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity868Repository implements Entity868DatasourcePort, PanacheRepository<Entity868> {
    @Override
    public Optional<Model868> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
