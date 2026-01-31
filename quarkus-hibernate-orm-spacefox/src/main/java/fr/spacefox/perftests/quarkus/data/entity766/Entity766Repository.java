package fr.spacefox.perftests.quarkus.data.entity766;

import fr.spacefox.perftests.quarkus.core.port.data.Entity766DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service766.model.Model766;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity766Repository implements Entity766DatasourcePort, PanacheRepository<Entity766> {
    @Override
    public Optional<Model766> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
