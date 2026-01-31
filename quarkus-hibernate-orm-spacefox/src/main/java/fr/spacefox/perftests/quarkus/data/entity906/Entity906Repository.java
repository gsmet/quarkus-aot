package fr.spacefox.perftests.quarkus.data.entity906;

import fr.spacefox.perftests.quarkus.core.port.data.Entity906DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service906.model.Model906;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity906Repository implements Entity906DatasourcePort, PanacheRepository<Entity906> {
    @Override
    public Optional<Model906> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
