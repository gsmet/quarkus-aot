package fr.spacefox.perftests.quarkus.data.entity843;

import fr.spacefox.perftests.quarkus.core.port.data.Entity843DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service843.model.Model843;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity843Repository implements Entity843DatasourcePort, PanacheRepository<Entity843> {
    @Override
    public Optional<Model843> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
