package fr.spacefox.perftests.quarkus.data.entity373;

import fr.spacefox.perftests.quarkus.core.port.data.Entity373DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service373.model.Model373;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity373Repository implements Entity373DatasourcePort, PanacheRepository<Entity373> {
    @Override
    public Optional<Model373> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
