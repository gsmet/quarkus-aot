package fr.spacefox.perftests.quarkus.core.service302;

import fr.spacefox.perftests.quarkus.core.port.data.Entity302DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service302.model.Model302;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service302 {

    private final Entity302DatasourcePort datasource;

    public Service302(Entity302DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model302 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
