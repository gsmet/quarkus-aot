package fr.spacefox.perftests.quarkus.core.service373;

import fr.spacefox.perftests.quarkus.core.port.data.Entity373DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service373.model.Model373;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service373 {

    private final Entity373DatasourcePort datasource;

    public Service373(Entity373DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model373 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
