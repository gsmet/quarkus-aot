package fr.spacefox.perftests.quarkus.data.entity74;

import fr.spacefox.perftests.quarkus.core.port.data.Entity74DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service74.model.Model74;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity74Repository implements Entity74DatasourcePort, PanacheRepository<Entity74> {
    @Override
    public Optional<Model74> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
