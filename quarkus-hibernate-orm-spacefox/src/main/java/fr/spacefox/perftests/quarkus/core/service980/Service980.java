package fr.spacefox.perftests.quarkus.core.service980;

import fr.spacefox.perftests.quarkus.core.port.data.Entity980DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service980.model.Model980;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service980 {

    private final Entity980DatasourcePort datasource;

    public Service980(Entity980DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model980 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
