package fr.spacefox.perftests.quarkus.core.service270;

import fr.spacefox.perftests.quarkus.core.port.data.Entity270DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service270.model.Model270;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service270 {

    private final Entity270DatasourcePort datasource;

    public Service270(Entity270DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model270 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
